public class Students_details {
    public String name;
    private String ID;
    private Section_char no;
    public void Read()
    {
        System. out. println  ("student reads");
    }
    private void dance()
    {
        System. out. println      ("student can dance");
    }
    protected void fight()
    {
        System .out .println ("student can fight");
    }
public static void main(String args[])
{
    Students_details.Ram = new Student_details();
    Ram. Name = "Ram";
    Ram.ID="24";
    Ram. Section =" CSE ";
    Ram. Read();
    Ram. Dance();
    Ram. Fight();
    {
        System .out . println ("student name:"+Ram . Name);
    }

}
}
