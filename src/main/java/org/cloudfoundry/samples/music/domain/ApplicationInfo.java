package org.cloudfoundry.samples.music.domain;

public class ApplicationInfo {
    private String[] profiles;
    private String[] services;
    private String I;

    public ApplicationInfo(String[] profiles, String[] services) {
        this.profiles = profiles;
        this.services = services;
    }

    public String[] getProfiles() {
        return profiles;
    }

    public String getI() {
		return I;
	}

	public void setI(String i) {
		I = i;
	}

	public void setProfiles(String[] profiles) {
        this.profiles = profiles;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }
}
