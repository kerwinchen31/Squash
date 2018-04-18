// Team Squash ( Kendrick Liang, Kayli Matsuyoshi, Lynne Wang )
// APCS2 pd1
// HW37 --
// 2018-04-19r

/*****************************************************
 * interface Deque
 * Double-Ended Queue
 ******************************************************/

public interface Deque<Card> {

    public int size();
    
    public Card getFirst();
    public Card getLast();
    public Card element();
    
    public boolean add( Card e );
    public void addFirst( Card e );
    public void addLast( Card e );
    
    public boolean contains( Object o );
 
    public Iterator<Card> descendingIterator();
    public Iterator<Card> iterator();
    
    public boolean offer( Card e );
    public boolean offerFirst( Card e );
    public boolean offerLast( Card e );
    
    public Card peek();
    public Card peekFirst();
    public Card peekLast();
    
    public Card poll();
    public Card pollFirst();
    public Card pollLast();
    
    public Card pop();
    public void push( Card e );
    
    public Card remove();
    public boolean remove( Object o );
    public Card removeFirst();
    public boolean removeFirstOccurrence( Object o );
    public Card removeLast();
    public boolean removeLastOccurence();
    
    
}