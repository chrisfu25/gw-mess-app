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
		                          "https"
		                                                        + "://images.unsplash"
		                          + ".com/photo-1519681393784-d120267933ba"
		                          + "?ixid"
		                          +
		                          "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib"
		                          + "=rb-1.2.1&auto=format&fit=crop&w=750&q=80"
		));
		add(new VordruckeViewCard("B-Einsatz", "Biologische Gefahren",
		                          "Snow " + "covered mountain",
								  "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.",
		                          "https://images.unsplash"
		                          + ".com/photo-1512273222628-4daea6e55abb"
		                          + "?ixid"
		                          +
		                          "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib"
		                          + "=rb-1.2.1&auto=format&fit=crop&w=750&q=80"
		));
		add(new VordruckeViewCard("C-Einsatz", "Chemische Gefahren",
		                          "River " + "between mountains",
								  "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.",
		                          "https://images.unsplash"
		                          + ".com/photo-1536048810607-3dc7f86981cb"
		                          + "?ixid"
		                          +
		                          "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=375&q=80"));
		add(new VordruckeViewCard("Unbekannter Stoff",
		                          "Gefährdung durch " + "unbekannten "
		                          + "Gefahrstoff", "Milky way on mountains",
								  "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.",
		                          "https://images.unsplash"
		                          + ".com/photo-1515705576963-95cad62945b6"
		                          + "?ixlib=rb-1.2" + ".1&ixid"
		                          +
		                          "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D"
		                          + "&auto=format&fit=crop&w=750&q=80"));
		add(new VordruckeViewCard("Messen / Messleitung",
		                          "Abschnittsleitung Messen",
		                          "Mountain " + "with fog",
								  "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.",
		                          "https://images.unsplash"
		                          + ".com/photo-1513147122760-ad1d5bf68cdb"
		                          + "?ixid"
		                          +
		                          "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib"
		                          + "=rb-1.2.1&auto=format&fit=crop&w=1000&q"
		                          + "=80"));
		add(new VordruckeViewCard("Alle Dokumente", "", "Mountain at night",
								  "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.",
		                          "https://images.unsplash"
		                          + ".com/photo-1562832135-14a35d25edef?ixid"
		                          +
		                          "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1"
		                          + ".2.1&auto=format&fit=crop&w=815&q=80"));
	}
}