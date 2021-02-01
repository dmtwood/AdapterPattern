package com.dimidev.adapterpattern.figuredrawer;

public class DrawAdaptedFigureApp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MainDrawer dr = new MainDrawer();
        dr.drawAllKindsOfFigures(new FigureDrawerAdapter(new FigureDrawer()));
    }
}
