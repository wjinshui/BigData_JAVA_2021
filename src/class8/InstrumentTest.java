package class8;

public class InstrumentTest
{
	void testPlay(Instrument instrument)
	{
		instrument.play();
	}

	public static void main(String[] args)
	{
		InstrumentTest instrumentTest = new InstrumentTest();
		instrumentTest.testPlay(new Piano());
		instrumentTest.testPlay(new Violin());
		Piano piano = new Piano();		

	}

}
