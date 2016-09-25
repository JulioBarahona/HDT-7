import java.util.Iterator;

/*Codigo tomado del libro de texto  Java Structures de Duane A. Bailey*/
public class BinaryTree<E>
{
    public BinaryTree(){}
    //post: constructor that generates an empty node

    public BinaryTree(E value){}
    //post: returns a tree referencing value and two empty subtrees

    public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right)
    //post: returns a tree referencing value and two subtrees

    public BinaryTree<E> left(){
        return null;
    }
    //post: returns reference to (possibly empty) left subtrees

    public BinaryTree<E> parent(){
        return null;
    }
    //post: returns reference to parent node, or null

    public void setLeft(BinaryTree<E> newLeft){}
    //post: sets left subtree to newLeft

    public  void setParent(BinaryTree<E> newParent){}
    //post: re-parent this node to parent reference, or null

    public Iterator<E> iterator(){
        return null;
    }
    //post: returns and in-order iterator of the elements

    public boolean isLeftChild(){
        return false;
    }
    //post: returns true if this is a left child of parent

    public  E value(){
        return null;
    }
    //post: returns value associated with this node

    public void setValue(E value){}
    //post: sets the value associated with this node


}