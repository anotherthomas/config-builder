package com.tngtech.propertyloader.impl;

import com.tngtech.propertyloader.impl.filters.EnvironmentResolvingFilter;
import com.tngtech.propertyloader.impl.filters.WarnIfPropertyHasToBeDefined;
import com.tngtech.propertyloader.impl.filters.VariableResolvingFilter;
import com.tngtech.propertyloader.impl.filters.WarnOnSurroundingWhitespace;
import com.tngtech.propertyloader.impl.interfaces.PropertyLoaderFilter;
import com.tngtech.propertyloader.impl.openers.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

@Component
public class PropertyLoaderFactory {

    public Properties getEmptyProperties(){
        return new Properties();
    }

    public InputStreamReader getInputStreamReader(InputStream stream, String encoding) throws IOException {
        return new InputStreamReader(stream, encoding);
    }

    public URLFileOpener getURLFileOpener(){
        return new URLFileOpener();
    }

    public URLFileOpener getURLFileOpener(String directory){
        return new URLFileOpener(directory);
    }

    public ContextClassLoaderOpener getContextClassLoaderOpener(){
        return new ContextClassLoaderOpener();
    }

    public RelativeToClassOpener getRelativeToClass(Class<?> tClass){
        return new RelativeToClassOpener(tClass);
    }

    public ClassLoaderOpener getClassLoaderOpener(ClassLoader classLoader){
        return new ClassLoaderOpener(classLoader);
    }

    public URLFileOpener getURLFileOpener(URL url){
        return new URLFileOpener(url);
    }

    public PropertyLoaderFilter getVariableResolvingFilter(){
        return new VariableResolvingFilter();
    }

    public PropertyLoaderFilter getEnvironmentResolvingFilter(){
        return new EnvironmentResolvingFilter();
    }

    public PropertyLoaderFilter getWarnIfPropertyHasToBeDefined(){
        return new WarnIfPropertyHasToBeDefined();
    }

    public PropertyLoaderFilter getWarnOnSurroundingWhitespace(){
        return new WarnOnSurroundingWhitespace();
    }

}
