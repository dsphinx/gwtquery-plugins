#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.plugins.${parentArtifactId}.client;

import static com.google.gwt.query.client.GQuery.*;
import static ${package}.plugins.${parentArtifactId}.client.${pluginName}.${pluginName};

import com.google.gwt.core.client.EntryPoint;

/**
 * Example code BasePlugin plugin for GwtQuery
 */
public class ${pluginName}Sample implements EntryPoint {

  public void onModuleLoad() {
    
    ${symbol_dollar}("div").as(${pluginName}).apply();
    
  }
}
