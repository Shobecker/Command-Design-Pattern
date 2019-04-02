/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import Aggregator.*;

/**
 *
 * @author Elias
 */
public class CMDGetTab implements Command {

    private Aggregator agg;

    public CMDGetTab(Aggregator agg) {
        this.agg = agg;
    }

    @Override
    public Object execute() {
        return new Tab(agg.getTab(agg.getMenu(), agg.getOrders()));
    }
}
