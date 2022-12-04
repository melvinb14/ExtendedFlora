package com.melvinbur.extendedflora.util;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

public final class Logger {
    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();
    private final String modPref;

    public Logger(String modID) {
        this.modPref = "[" + modID + "] ";
    }

    public void log(Level level, String message) {
        LOGGER.log(level, modPref + message);
    }

    public void log(Level level, String message, Object... params) {
        LOGGER.log(level, modPref + message, params);
    }

    public void debug(Object message) {
        this.log(Level.DEBUG, message.toString());
    }

    public void debug(Object message, Object... params) {
        this.log(Level.DEBUG, message.toString(), params);
    }

    public void catching(Throwable ex) {
        this.error(ex.getLocalizedMessage());
        LOGGER.catching(ex);
    }

    public void info(String message) {
        this.log(Level.INFO, message);
    }

    public void info(String message, Object... params) {
        this.log(Level.INFO, message, params);
    }

    public void warning(String message, Object... params) {
        this.log(Level.WARN, message, params);
    }

    public void warning(String message, Object obj, Exception ex) {
        LOGGER.warn(modPref + message, obj, ex);
    }

    public void error(String message) {
        this.log(Level.ERROR, message);
    }

    public void error(String message, Object obj, Exception ex) {
        LOGGER.error(modPref + message, obj, ex);
    }

    public void error(String message, Exception ex) {
        LOGGER.error(modPref + message, ex);
    }
}