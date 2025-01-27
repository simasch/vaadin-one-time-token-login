package ch.martinelli.demo.vaadinott.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import jakarta.annotation.security.PermitAll;

@PermitAll
@Route("")
// This is the default path Spring Security sends the user to if the login with the OT was successful
@RouteAlias("/ott/sent")
public class MainView extends VerticalLayout {

    public MainView() {
        add(new H1("Vaadin OTT Demo"));
    }
}
