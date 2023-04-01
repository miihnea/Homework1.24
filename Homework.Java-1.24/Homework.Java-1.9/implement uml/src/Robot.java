public class Robot extends Mechanism
{
    private Computer computer;
    Robot(Computer computer){
        this.computer=computer;
    }
    @Override
    void Move()
    {
        super.Move();
    }
    void boot()
    {
        computer.boot();

    }
    void on()
    {
        computer.on();
    }
    void off()
    {
        computer.off();
    }

}
