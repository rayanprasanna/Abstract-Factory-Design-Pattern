package com.xora_cooperation.ryan.factories;

import com.xora_cooperation.ryan.products.AsusGpu;
import com.xora_cooperation.ryan.products.AsusMonitor;
import com.xora_cooperation.ryan.products.Gpu;
import com.xora_cooperation.ryan.products.Monitor;

public class AsusManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
