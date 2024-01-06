package assignment;

public class Frog implements TerrestrialAnimals,AquaticAnimal
{
    @Override
	public void isLive() {
		System.out.println("Frog can live both in water and land");
		}
     @Override
	public void specialCapabilities() {
		System.out.println("Frog can expand its tongue");
		}
    @Override
	public void isBreathing() {
	System.out.println("frogs are breathing through moist skin in water ");
	System.out.println("Frogs are breathing through lungs in land");
		}
    @Override
	public void movements() {
		System.out.println("Frog can hop");
		System.out.println("It can swim");
		}
   @Override
	public void eatingHabit() {
		System.out.println("it is using its long tongue to hunt its prey");
	}
	@Override
	public void isUnderWaterAnimal() {
		System.out.println("First growth stage of frog is as underwater animal only,that stage is called tadpole");
		}
    @Override
	public void islandAnimal() {
    System.out.println("Adult frog can live in land also");
		}
	public void specialChar()
	{
		System.out.println("Frog is an amphibian");
	}
public static void main(String []args)
{
Frog a=new Frog();
a.isUnderWaterAnimal();//implemented method from AquaticAnimals interface

a.islandAnimal();//implemented method form TerrestrialAnimals interface

a.isLive();//implemented method from animals

a.isBreathing();//implemented method from animals

a.movements();//implemented method from animals

a.specialCapabilities();//implemented method from animals

a.specialChar();//individual method from animals

a.eatingHabit();//implemented method from animals
}
}

	
	















	

