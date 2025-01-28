package ch.martinelli.demo.vaadinott.view;

import ch.martinelli.demo.vaadinott.security.Roles;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.core.context.SecurityContextHolder;

@RolesAllowed({Roles.USER, Roles.ADMIN})
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        add(new H1("Vaadin OTT Demo"));

        add(new H2("You are logged in as " + SecurityContextHolder.getContext().getAuthentication().getName()));
    }
}
