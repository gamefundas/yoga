package org.skyscreamer.yoga.model;


public abstract class AbstractHierarchicalModel implements HierarchicalModel
{

    @Override
    public HierarchicalModel createChild(String property)
    {
        MapHierarchicalModel child = new MapHierarchicalModel();
        addSimple( property, child.getObjectTree() );
        return child;
    }

    @Override
    public HierarchicalModel createList(String property)
    {
        ListHierarchicalModel child = new ListHierarchicalModel();
        addSimple( property, child.getList() );
        return child;
    }
}
