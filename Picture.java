/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @author  Michael B
 * @version 2023.01.30
 * 
 * This image represents the houses of Spongebob, Patrick, and Squidward.
 */
public class Picture
{
    private Square sky;
    private Square sand;
    private Square house;
    private Square house2;
    private Square door;
    private Circle doorArch;
    private Triangle roof;
    private Square pineapple;
    private Square door2;
    private Circle door2Arch;
    private Circle window1;
    private Circle window2;
    private Circle eyeLeft;
    private Circle eyeRight;
    private Circle rock;
    private Triangle nose;
    private Square eyebrow1;
    private Square eyebrow2;
    private Square eyebrow3;
    private Square eyebrow4;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        rock = new Circle();
        sand = new Square();
        house = new Square();
        house2 = new Square();
        door = new Square();
        doorArch = new Circle();
        pineapple = new Square();
        door2 = new Square();
        door2Arch = new Circle();
        roof = new Triangle();
        window1 = new Circle();
        window2 = new Circle();
        eyeLeft = new Circle();
        eyeRight = new Circle();
        nose = new Triangle();
        eyebrow1 = new Square();
        eyebrow2 = new Square();
        eyebrow3 = new Square();
        eyebrow4 = new Square();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("skyblue");
            sky.moveHorizontal(-310);
            sky.moveVertical(-310);
            sky.changeSize(500);
            sky.makeVisible();
            
            rock.changeColor("brown");
            rock.moveHorizontal(-200);
            rock.moveVertical(115);
            rock.changeSize(108);
            rock.makeVisible();
            
            sand.changeColor("lightyellow");
            sand.moveHorizontal(-310);
            sand.moveVertical(140);
            sand.changeSize(500);
            sand.makeVisible();
            
            house.changeColor("darkblue");
            house.moveHorizontal(-140);
            house.moveVertical(20);
            house.changeSize(120);
            house.makeVisible();
            house2.changeColor("darkblue");
            house2.moveHorizontal(-140);
            house2.moveVertical(-40);
            house2.changeSize(120);
            house2.makeVisible();
            
            door.changeColor("brown");
            door.moveHorizontal(-100);
            door.moveVertical(100);
            door.changeSize(40);
            door.makeVisible();    
            doorArch.changeColor("brown");
            doorArch.moveHorizontal(-20);
            doorArch.moveVertical(110);
            doorArch.changeSize(40);
            doorArch.makeVisible();            
            
            pineapple.changeColor("orange");
            pineapple.moveHorizontal(25);
            pineapple.moveVertical(20);
            pineapple.changeSize(120);
            pineapple.makeVisible();
            
            door2.changeColor("lightblue");
            door2.moveHorizontal(65);
            door2.moveVertical(100);
            door2.changeSize(40);
            door2.makeVisible();
            door2Arch.changeColor("lightblue");
            door2Arch.moveHorizontal(145);
            door2Arch.moveVertical(110);
            door2Arch.changeSize(40);
            door2Arch.makeVisible();
            
            roof.changeSize(60, 180);
            roof.moveHorizontal(185);
            roof.moveVertical(-60);
            roof.makeVisible();
            
            window1.changeColor("lightblue");
            window1.moveHorizontal(120);
            window1.moveVertical(65);
            window1.changeSize(25);
            window1.makeVisible();
            
            window2.changeColor("lightblue");
            window2.moveHorizontal(192);
            window2.moveVertical(115);
            window2.changeSize(25);
            window2.makeVisible();
            
            eyeLeft.changeColor("lightblue");
            eyeLeft.moveHorizontal(-40);
            eyeLeft.moveVertical(40);
            eyeLeft.changeSize(25);
            eyeLeft.makeVisible();
            
            eyeRight.changeColor("lightblue");
            eyeRight.moveHorizontal(15);
            eyeRight.moveVertical(40);
            eyeRight.changeSize(25);
            eyeRight.makeVisible();
            
            nose.changeColor("blue");
            nose.changeSize(65, 40);
            nose.moveHorizontal(20);
            nose.moveVertical(-4);
            nose.makeVisible();
            
            eyebrow1.changeColor("blue");
            eyebrow1.moveHorizontal(-120);
            eyebrow1.moveVertical(-9);
            eyebrow1.changeSize(20);
            eyebrow1.makeVisible();
            eyebrow2.changeColor("blue");
            eyebrow2.moveHorizontal(-100);
            eyebrow2.moveVertical(-9);
            eyebrow2.changeSize(20);
            eyebrow2.makeVisible(); 
            eyebrow3.changeColor("blue");
            eyebrow3.moveHorizontal(-80);
            eyebrow3.moveVertical(-9);
            eyebrow3.changeSize(20);
            eyebrow3.makeVisible();
            eyebrow4.changeColor("blue");
            eyebrow4.moveHorizontal(-60);
            eyebrow4.moveVertical(-9);
            eyebrow4.changeSize(20);
            eyebrow4.makeVisible();
            
            person.moveHorizontal(70);
            person.moveVertical(70);
            person.changeSize(40, 20);
            person.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("white");
        rock.changeColor("black");
        sand.changeColor("black");
        house.changeColor("black");
        house2.changeColor("black");
        door.changeColor("white");
        doorArch.changeColor("white");
        pineapple.changeColor("black");
        door2.changeColor("white");
        door2Arch.changeColor("white");
        roof.changeColor("black");
        window1.changeColor("white");
        window2.changeColor("white");
        eyeLeft.changeColor("white");
        eyeRight.changeColor("white");
        nose.changeColor("white");
        eyebrow1.changeColor("white");
        eyebrow2.changeColor("white");
        eyebrow3.changeColor("white");
        eyebrow4.changeColor("white");
        person.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("skyblue");
        rock.changeColor("brown");
        sand.changeColor("lightyellow");
        house.changeColor("darkblue");
        house2.changeColor("darkblue");
        door.changeColor("brown");
        doorArch.changeColor("brown");
        pineapple.changeColor("orange");
        door2.changeColor("lightblue");
        door2Arch.changeColor("lightblue");
        roof.changeColor("green");
        window1.changeColor("lightblue");
        window2.changeColor("lightblue");
        eyeLeft.changeColor("lightblue");
        eyeRight.changeColor("lightblue");
        nose.changeColor("lightblue");
        eyebrow1.changeColor("blue");
        eyebrow2.changeColor("blue");
        eyebrow3.changeColor("blue");
        eyebrow4.changeColor("blue");
        person.changeColor("black");
    }
}
