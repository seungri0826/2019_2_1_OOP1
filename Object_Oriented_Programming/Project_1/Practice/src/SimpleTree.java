import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
 
public class SimpleTree extends JFrame {
  public SimpleTree() {
    String[] treelabels =   { 
                             "All Auctions", 
                             "Closed Auction", 
                             "Open Auctions"};
    Integer[] closedItems = { new Integer(500144), 
                              new Integer(500146), 
                              new Integer(500147)};
 
    Integer[] openItems = { new Integer(500148), 
                            new Integer(500149)};
                                             
    DefaultMutableTreeNode[] nodes = new 
        DefaultMutableTreeNode[treelabels.length];
    DefaultMutableTreeNode[] closednodes = new 
        DefaultMutableTreeNode[closedItems.length];
    DefaultMutableTreeNode[] opennodes = new 
        DefaultMutableTreeNode[openItems.length];
 
    for (int i=0; i < treelabels.length; i++) {
      nodes[i] = new 
        DefaultMutableTreeNode(treelabels[i]); 
    }
    nodes[0].add(nodes[1]);
    nodes[0].add(nodes[2]);
 
    for (int i=0; i < closedItems.length; i++) {
       closednodes[i] = new 
                DefaultMutableTreeNode(closedItems[i]); 
       nodes[1].add(closednodes[i]);
    }
 
    for (int i=0; i < openItems.length; i++) {
       opennodes[i] = new 
                DefaultMutableTreeNode(openItems[i]); 
       nodes[2].add(opennodes[i]);
    }
    DefaultTreeModel model=new 
                DefaultTreeModel(nodes[0]);
 
    JTree tree = new JTree(model);
 
    JScrollPane scroll = new JScrollPane(tree);
    getContentPane().add(scroll, BorderLayout.CENTER);
  }                                                               
 
  public static void main(String[] args) {
    SimpleTree frame = new SimpleTree();
    frame.addWindowListener( new WindowAdapter() {
      public void windowClosing( WindowEvent e ) {
        System.exit(0);
      }
    });
    frame.setVisible(true);
    frame.pack();
    frame.setSize(150,150);
  }                          
}
