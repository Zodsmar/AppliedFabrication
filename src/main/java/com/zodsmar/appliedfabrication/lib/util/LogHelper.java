package com.zodsmar.appliedfabrication.lib.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.zodsmar.appliedfabrication.lib.reference.ModInfo;

import cpw.mods.fml.common.FMLLog;

public class LogHelper
{
	private static Logger logger = Logger.getLogger(ModInfo.MODNAME);

	public static void init() {
	logger.setParent((Logger) FMLLog.getLogger());
	}

	public static void log(Level logLevel, String message) {
	logger.log(logLevel, message);
	}
}
