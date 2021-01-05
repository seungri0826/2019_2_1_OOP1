// Digital Logic Design and Experiment
// Final Project
// Implementing a Hack "Drawing" Assembly Program
// by Seungri You (2018920031)
// Department of Computer Science
// University of Seoul
// File name: Draw.asm
// Additional Function: (1) When the dot(cell) is on the boundary, it doesn't move further.
//                      (2) The "sensitive key" issue is solved.


@SCREEN // 16384
D=A
@addr
M=D
@cnt
M=0

(GRID)
    // 가로줄 그리기
    @32 // 한 줄의 cell의 개수
    D=A
    @cnt
    M=D
    (HORIZONTAL_LINE)
        @addr
        A=M
        M=-1
        @addr
        M=M+1
        @cnt
        M=M-1
        D=M
        @HORIZONTAL_LINE
        D;JGT

    // 세로줄 그리기
    @480 // 15*32, 한 줄의 cell(32개)의 세로줄을 그리는 데 찍어야하는 점 수
    D=A
    @cnt
    M=D
    (VERTICAL_LINE)
        @addr
        A=M
        M=1
        @addr
        M=M+1
        @cnt
        M=M-1
        D=M
        @VERTICAL_LINE
        D;JGT

    // addr가 0x5fff를 넘어가지 않는 범위에서 한 줄의 cell 그리기 반복
    @addr
    D=M
    @24575 // 0x5fff
    D=D-A
    @GRID
    D;JLE


// posX, posY 초기 위치 (16,8) 설정
@16
D=A
@posX
M=D
@8
D=A
@posY
M=D


(CELL)
    // posX, posY 값을 미리 posX_prev, posY_prev에 복사
    // (ERASE)에서 사용하기 위해서
    @posX
    D=M
    @posX_prev
    M=D
    @posY
    D=M
    @posY_prev
    M=D

    @16416 // 첫 번째 cell에서 두 번째 줄 (16384+32)
    D=A
    @addr
    M=D

    // 해당 위치(pos)의 주솟값 구하기
    @posY
    D=M
    @cnt
    M=D
    @FIND_posX
    D;JEQ
    (FIND_posY)
        @512 // 32*16, 한 줄 띄기
        D=A
        @addr
        M=M+D 
        @cnt
        M=M-1
        D=M
        @FIND_posY
        D;JGT
    (FIND_posX)
        @posX
        D=M
        @addr
        M=M+D    

    // cell 채우기
    @15 // 15개의 줄
    D=A
    @cnt
    M=D
    (FILL)
        @addr
        A=M
        M=-1 // 0xffff
        @32 // 다음 줄을 채우기 위함
        D=A 
        @addr
        M=M+D
        @cnt
        M=M-1
        D=M
        @FILL
        D;JGT


// 키보드 화살표 입력 분류
(KEYBOARD_ARROWS)
    @KBD
    D=M
     
    @KBD_tmp
    M=D
    D=M
    @130 // left arrow
    D=D-A
    @LEFT
    D;JEQ

    @KBD_tmp
    D=M
    @131 // up arrow
    D=D-A 
    @UP
    D;JEQ

    @KBD_tmp
    D=M
    @132 // right arrow
    D=D-A 
    @RIGHT
    D;JEQ

    @KBD_tmp
    D=M
    @133 // down arrow
    D=D-A 
    @DOWN
    D;JEQ

    @KEYBOARD_ARROWS
    0;JMP
    
    // 키보드 화살표 입력에 따른 동작
    (LEFT)
        @posX
        D=M
        @KEY
        D;JEQ
        @posX
        M=M-1
        @KEY
        0;JMP

    (UP)
        @posY
        D=M
        @KEY
        D;JEQ
        @posY
        M=M-1
        @KEY
        0;JMP

    (RIGHT)
        @posX
        D=M
        @31 // boundary 넘어가지 않도록
        D=D-A 
        @KEY
        D;JEQ
        @posX
        M=M+1
        @KEY
        0;JMP

    (DOWN)
        @posY
        D=M
        @15 // boundary 넘어가지 않도록
        D=D-A 
        @KEY 
        D;JEQ
        @posY
        M=M+1
        @KEY
        0;JMP

    (KEY)
        @KBD
        D=M
        @ERASE 
        D;JEQ // 키보드 입력이 없을 때
        @KEY
        0;JMP


(ERASE)
    // cell 이동 시 기존 cell 지우기
    @16416 // 첫 번째 cell에서 두 번째 줄 (16384+32)
    D=A 
    @addr
    M=D

    // 이전 위치(pos_prev)의 주솟값 구하기
    @posY_prev
    D=M
    @cnt
    M=D 
    @FIND_posX_prev
    D;JEQ
    (FIND_posY_prev)
        @512 // 32*16, 한 줄 띄기
        D=A 
        @addr
        M=M+D 
        @cnt
        M=M-1
        D=M
        @FIND_posY_prev
        D;JGT
    (FIND_posX_prev)
        @posX_prev
        D=M
        @addr
        M=M+D

    // cell 지우기
    @15 // 15개의 줄
    D=A 
    @cnt
    M=D
    (EMPTY)
        @addr
        A=M
        M=1
        @32 // 다음 줄을 지우기 위함
        D=A 
        @addr
        M=M+D
        @cnt
        M=M-1
        D=M
        @EMPTY
        D;JGT


@CELL
0;JMP