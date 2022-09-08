package com.xora_cooperation.ryan.factories;

import com.xora_cooperation.ryan.products.Gpu;
import com.xora_cooperation.ryan.products.Monitor;

public abstract class Company {
    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
