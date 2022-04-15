public class Inner{
    public static void main(String[] args) {
        Robot r = new Robot();
        Robot t = new Robot();

        System.out.println(r.equals(t));

    }
    
}
class Robot{
    int id = 0;
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Robot other = (Robot) obj;
        if (id != other.id)
            return false;
        return true;
    }
    Robot(){
        Brain b = new Brain();
        b.think();
    }
    private class Brain{
        public void think(){
            System.out.println(id + "is thinking");
        }
    }
}