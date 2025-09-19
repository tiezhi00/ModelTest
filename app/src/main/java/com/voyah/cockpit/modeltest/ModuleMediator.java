package com.voyah.cockpit.modeltest;

public class ModuleMediator {
    public void initModules(Application application) {
        // Initialize other modules here
        // For example:
        // AppVideoModule.init(application);
        // AppSettingModule.init(application);

    }
    public interface ModuleInitial {
        void initModule();
    }

}
