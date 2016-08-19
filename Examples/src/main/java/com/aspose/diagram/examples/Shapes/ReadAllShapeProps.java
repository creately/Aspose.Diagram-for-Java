package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.Prop;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class ReadAllShapeProps {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:ReadAllShapeProps
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadAllShapeProps.class);  

        // call a Diagram class constructor to load the VSDX diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // get page by name
        Page page = diagram.getPages().getPage("Page-3");

        for (Shape shape :(Iterable<Shape>) page.getShapes())
        {
            if (shape.getName() == "Process1")
            {
                for (Prop property :(Iterable<Prop>) shape.getProps())
                {
                    System.out.println(property.getLabel().getValue() + ": " + property.getValue().getVal());
                }
                break;
            }
        }
        //ExEnd:ReadAllShapeProps
	}

}
