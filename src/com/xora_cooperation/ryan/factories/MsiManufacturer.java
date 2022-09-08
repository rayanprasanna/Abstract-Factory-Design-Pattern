package com.xora_cooperation.ryan.factories;

import com.xora_cooperation.ryan.products.Gpu;
import com.xora_cooperation.ryan.products.Monitor;
import com.xora_cooperation.ryan.products.MsiGpu;
import com.xora_cooperation.ryan.products.MsiMonitor;

public class MsiManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
