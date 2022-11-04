package OOPs.Inheritance;
// MULTIPLE INHERITANCE
interface Browser { void browser();}
interface Browser2 { void browser2();}
interface Browser3 { void browse3r();}

class Browsers implements Browser,Browser2,Browser3 {

    @Override
    public void browser() {
        System.out.println("Chrome");
    }

    @Override
    public void browser2() {
        System.out.println("Fire fox");
    }

    @Override
    public void browse3r() {
        System.out.println("Safari");
    }
}
class MultipleInheritance extends Browsers {
    public static void main(String[] args) {
     MultipleInheritance b1 = new MultipleInheritance();
    b1.browser();
    b1.browser2();
    b1.browse3r();
    }

}

