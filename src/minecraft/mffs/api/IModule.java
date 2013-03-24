package mffs.api;

public interface IModule
{
	/**
	 * The amount of fortron this module consumes per tick.
	 * 
	 * @return
	 */
	public float getFortronCost();
}