package com.example.application.views.vordrucke;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Vordrucke")
@Route(value = "Vordrucke", layout = MainLayout.class)
@Tag("vordrucke-view")
@JsModule("./views/vordrucke/vordrucke-view.ts")
public class VordruckeView extends LitTemplate implements HasComponents,
                                                          HasStyle {

	@Id private Select<String> sortBy;

	public VordruckeView() {
		addClassNames("vordrucke-view", "flex", "flex-col", "h-full");
		sortBy.setItems("Popularity", "Newest first", "Oldest first");
		sortBy.setValue("Popularity");

		add(new VordruckeViewCard("A-Einsatz",
		                          "Atomare Gefahren / " + "Radioaktivität",
		                          "Snow " + "mountains under stars",
		                          "Zuordnung der Messgeräte uvm.",
		                          "https://upload.wikimedia"
		                          + ".org/wikipedia/commons/a/a8/ISO_7010_W003"
		                          + ".svg"));
		add(new VordruckeViewCard("B-Einsatz", "Biologische Gefahren",
		                          "Snow " + "covered mountain",
		                          "Lorem ipsum dolor sit amet, consectetur "
		                          + "adipisicing elit, sed do eiusmod tempor "
		                          + "incididunt ut.",
		                          "https://upload.wikimedia"
		                          + ".org/wikipedia/commons/f/f7/Biohazard"
		                          + ".svg"));
		add(new VordruckeViewCard("C-Einsatz", "Chemische Gefahren",
		                          "River " + "between mountains",
		                          "Lorem ipsum dolor sit amet, consectetur "
		                          + "adipisicing elit, sed do eiusmod tempor "
		                          + "incididunt ut.",
		                          "https://cdn-icons-png.flaticon.com/512/1283/1283419.png"));
		add(new VordruckeViewCard("Unbekannter Stoff",
		                          "Gefährdung durch " + "unbekannten "
		                          + "Gefahrstoff", "Milky way on mountains",
		                          "Lorem ipsum dolor sit amet, consectetur "
		                          + "adipisicing elit, sed do eiusmod tempor "
		                          + "incididunt ut.",
		                          "https://cdn-icons.flaticon.com/png/512/3088/premium/3088852.png?token=exp=1645122592~hmac=1be76dc129c5e921ae2746f38154e581"));
		add(new VordruckeViewCard("Messen / Messleitung",
		                          "Abschnittsleitung Messen",
		                          "Mountain with fog",
		                          "Lorem ipsum dolor sit amet, consectetur "
		                          + "adipisicing elit, sed do eiusmod tempor "
		                          + "incididunt ut.",
		                          "images/messleitung.JPEG"));
		add(new VordruckeViewCard("Alle Dokumente", "", "Mountain at night",
		                          "Lorem ipsum dolor sit amet, consectetur "
		                          + "adipisicing elit, sed do eiusmod tempor "
		                          + "incididunt ut.",
		                          "https://cdn-icons-png.flaticon.com/512/6899/6899241.png"));
	}
}