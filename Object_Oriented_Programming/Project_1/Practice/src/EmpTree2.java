import java.util.*;
import javax.swing.tree.*;
import javax.swing.*;
import javax.swing.event.*;

// class SEmployee
class SEmployee {
	protected String name, email;
	protected int age;
	protected boolean married;
	
	public SEmployee(String name, int age, String email, boolean m) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.married = m;
	}
	
	public String toString() {
		return name;
	}
	
	public String display() {
		String info = "\n" + name + "|" + age + "|" + email + "|";
		if(married) {
			info = info + "married";
		}
		else {
			info = info + "single";
		}
		return info;
	}
}

// class Dept
class Dept {
	protected String name;
	protected ArrayList<SEmployee> member;
	
	public Dept(String name) {
		this.name = name;
		member = new ArrayList<SEmployee>();
	}
	
	public void add(SEmployee e) {
		member.add(e);
	}
	
	public SEmployee get(int index) {
		return member.get(index);
	}
	
	public int size() {
		return member.size();
	}
	
	public int getIndexOf(SEmployee e) {
		for(int i=0 ; i<member.size(); i++) {
			SEmployee se = member.get(i);
			if(se == e) 
				return i;
		}
		return -1;
	}
	
	public String toString() {
		return name;
	}
	
	public String display() {
		String info = "\nDepartment of " + name;
		for(int i=0 ; i<member.size(); i++) {
			info += "\n\t" + member.get(i).toString();
		}
		return info;
	}
}

// class Com
class Com {
	protected String name;
	protected Dept res, dev;
	
	public Com(String name) {
		this.name = name;
		dev = new Dept("개발부");
		res = new Dept("연구소");
	}
	
	public Dept getDept(String name) {
		if(name.equals("개발부"))
			return dev;
		else
			return res;
	}
	
	public Dept getDept(int index) {
		if(index == 0)
			return dev;
		else
			return res;
	}
	
	public int getIndexOf(Dept d) {
		if(d == dev)
			return 0;
		else
			return 1;
	}
	
	public String toString() {
		return name;
	}
}

// class CompanyTreeModel
class CompanyTreeModel implements TreeModel {
	protected Com com;
	
	public CompanyTreeModel(Com c) {
		com = c;
	}
	
	public Object getChild(Object parent, int index) {
		if(parent instanceof Com) {
			Com c = (Com) parent;
			return c.getDept(index);
		}
		else if (parent instanceof Dept) {
			Dept d = (Dept) parent;
			return d.get(index);
		}
		return null;
	}
	
	public int getChildCount(Object parent) {
		if(parent instanceof Com) {
			return 2;
		}
		else if(parent instanceof Dept) {
			Dept d = (Dept)parent;
			return d.size();
		}
		return 0;
	}
	
	public int getIndexOfChild(Object parent, Object child) {
		if(parent instanceof Com) {
			Com c = (Com) parent;
			return c.getIndexOf((Dept)child);
		}
		else if(parent instanceof Dept) {
			Dept d = (Dept) parent;
			return d.getIndexOf((SEmployee)child);
		}
		return -1;
	}
	
	public Object getRoot() {
		return com;
	}
	
	public boolean isLeaf(Object node) {
		if(node instanceof Com) {
			return false;
		}
		else if(node instanceof Dept) {
			return false;
		}
		return true;
	}
	
	public void addTreeModelListener(TreeModelListener I) {}
	public void removeTreeModelListener(TreeModelListener I) {}
	public void valueForPathChanged(TreePath path, Object newValue) {}
}

// class EmpTree2
public class EmpTree2 extends JSplitPane {
	protected JTree tree;
	protected JTextArea display;
	
	public EmpTree2() {
		super(VERTICAL_SPLIT);
		Com com = new Com("자바 주식회사");
		
		Dept dev = com.getDept("개발부");
		dev.add(new SEmployee("Kim Y.C.", 22, "yckim@mycom", false));
		dev.add(new SEmployee("Byun J.S.", 20, "jsbyun@mycom", false));
		Dept res = com.getDept("연구소");
		res.add(new SEmployee("Shin K.H.", 23, "khshin@mycom", false));
		res.add(new SEmployee("Kim S.H.", 21, "shkim@mycom", true));
		
		CompanyTreeModel model = new CompanyTreeModel(com);
		
		tree = new JTree(model);
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				Object o = e.getPath().getLastPathComponent();
				if(o instanceof Dept) {
					display.append(((Dept)o).display());
				}
				else if(o instanceof SEmployee) {
					display.append(((SEmployee)o).display());
				}
			}
		});
		display = new JTextArea(5,20);
		add(new JScrollPane(tree));
		add(new JScrollPane(display));
		
	}
	
	public static void main(String args[]) {
		JFrame f = new JFrame("Tree Model Example");
		EmpTree2 tree = new EmpTree2();
		f.getContentPane().add("Center", tree);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,300);
		f.setVisible(true);
	}

}
