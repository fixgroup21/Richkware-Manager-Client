package it.richkmeli.rmc.swing;

import java.util.Map;

public interface ReverseCommandCallback {

    void onSuccess();

    void onFailure(Map<String, String> responseMap);

}
