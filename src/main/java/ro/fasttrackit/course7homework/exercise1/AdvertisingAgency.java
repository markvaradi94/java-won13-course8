package ro.fasttrackit.course7homework.exercise1;

public class AdvertisingAgency {
    private String[] clients;
    private AdProvider[] adProviders;
    private String content;

    public void runAds() {
        for (String client : clients) {
            for (AdProvider adProvider : adProviders) {
                advertiseForClient(client, adProvider);
            }
        }
    }

    private void advertiseForClient(String client, AdProvider adProvider) {
        System.out.println(client + " is running " + adProvider.getClass().getSimpleName() + " ads");
        adProvider.advertise(content);
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public AdProvider[] getAdProviders() {
        return adProviders;
    }

    public void setAdProviders(AdProvider[] adProviders) {
        this.adProviders = adProviders;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
