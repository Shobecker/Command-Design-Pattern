package Commands;

import Aggregator.*;

/**
 *
 * @author dierbach
 */
public class CMDGetMenu implements Command {

    private Aggregator agg;

    public CMDGetMenu(Aggregator agg) {
        this.agg = agg;
    }

    @Override
    public Object execute() {
        return new Menu(agg.getMenu()); // if copy constructor implemented
        // or
        // return agg.getMenu().clone(); // if clone method implemented 
    }

}
