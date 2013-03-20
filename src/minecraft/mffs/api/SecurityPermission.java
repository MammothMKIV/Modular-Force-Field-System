package mffs.api;

public enum SecurityPermission
{
	/**
	 * Warp - Allows going through force fields.
	 * 
	 * Access - Allows to open GUIs and activate blocks.
	 * 
	 * Configure - Allows to configure security stations.
	 * 
	 * Stay - Allows to stay in defense station zone.
	 * 
	 * Bypass Confiscation - Allows the bypassing of defense station confiscation.
	 * 
	 * Remote Control - Allows the usage of a remote control to open GUIs remotely.
	 */
	FORCE_FIELD_WARP("warp"), BLOCK_ACCESS("access"), SECURITY_CENTER_CONFIGURE("configure"),
	DEFENSE_STATION_STAY("bypassDefense"), DEFENSE_STATION_CONFISCATION("bypassConfiscation"),
	REMOTE_CONTROL("remoteControl");

	public final String name;

	private SecurityPermission(String name)
	{
		this.name = name;
	}
}