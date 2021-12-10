package com.barbassaulthelper;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BarbAssaultHelperPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BarbAssaultHelperPlugin.class);
		RuneLite.main(args);
	}
}