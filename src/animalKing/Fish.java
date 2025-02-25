package animalKing;

// interfaces contain methods, not fields.
// inherit from multiple interfaces

public class Fish extends Animals
{
	public Fish(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "swim";
	}

	@Override
	public String breathe()
	{
		return "gills";
	}

	@Override
	public String reproduce()
	{
		return "eggs";
	}

	@Override
	public String toString()
 	{
        return "Fish{" +
                // "food='" + food + '\'' +
                ", name=" + name + '\'' +
                ", year=" + year + 
                '}';
    }
}