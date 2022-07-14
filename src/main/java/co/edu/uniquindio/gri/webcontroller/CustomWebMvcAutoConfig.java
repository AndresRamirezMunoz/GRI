package co.edu.uniquindio.gri.webcontroller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import co.edu.uniquindio.gri.utilities.Util;

@Configuration
public class CustomWebMvcAutoConfig implements WebMvcConfigurer {

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("Path images investigador: " + Util.DIRECTORIO_IMAGENES_INVESTIGADOR_LOCAL);
		registry.addResourceHandler("/" + Util.DIRECTORIO_IMAGENES_INVESTIGADOR_SERVER + "/**")
				.addResourceLocations("file:" + Util.DIRECTORIO_IMAGENES_INVESTIGADOR_LOCAL);
	}
}