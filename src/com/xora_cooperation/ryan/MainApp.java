package com.xora_cooperation.ryan;

import com.xora_cooperation.ryan.factories.AsusManufacturer;
import com.xora_cooperation.ryan.factories.Company;
import com.xora_cooperation.ryan.factories.MsiManufacturer;
import com.xora_cooperation.ryan.products.Product;

import java.util.List;

public class MainApp {
    public static void main(String[] args){
        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
                .forEach(Product::assemble);

    }
}
