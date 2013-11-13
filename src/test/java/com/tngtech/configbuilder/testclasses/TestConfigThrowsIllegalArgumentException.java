package com.tngtech.configbuilder.testclasses;

import com.tngtech.configbuilder.annotation.configuration.LoadingOrder;
import com.tngtech.configbuilder.annotation.propertyloaderconfiguration.PropertiesFiles;
import com.tngtech.configbuilder.annotation.propertyloaderconfiguration.PropertyExtension;
import com.tngtech.configbuilder.annotation.propertyloaderconfiguration.PropertyLocations;
import com.tngtech.configbuilder.annotation.propertyloaderconfiguration.PropertySuffixes;
import com.tngtech.configbuilder.annotation.valueextractor.CommandLineValue;
import com.tngtech.configbuilder.annotation.valueextractor.DefaultValue;
import com.tngtech.configbuilder.annotation.valueextractor.PropertyValue;
import com.tngtech.propertyloader.PropertyLoader;

@PropertyExtension("testproperties")
@PropertySuffixes(extraSuffixes = {"test"})
@PropertyLocations(resourcesForClasses = {PropertyLoader.class}, fromClassLoader = true)
@PropertiesFiles("demoapp-configuration")
@LoadingOrder(value = {CommandLineValue.class, PropertyValue.class, DefaultValue.class})
public class TestConfigThrowsIllegalArgumentException {

    @DefaultValue("what")
    private int integer;
}