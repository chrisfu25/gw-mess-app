package com.example.application.views.vordrucke;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;

@JsModule("./views/vordrucke/vordrucke-view-card.ts")
@Tag("vordrucke-view-card")
public class VordruckeViewCard extends LitTemplate {

	@Id private Image image;

	@Id private Span header;

	@Id private Span subtitle;

	@Id private Paragraph text;

	@Id private Span badge;

	public VordruckeViewCard(String title, String subtitle, String altText,
	                         String description, String imgUrl) {
		this.image.setSrc(imgUrl);
		this.image.setAlt(altText);
		this.header.setText(title);
		this.subtitle.setText(subtitle);
		this.text.setText(description);
		this.badge.setText(title);
	}
}
