/**
 *  This package contains classes for CodeRAD models, such as {@link Entity}, {@link Property}, and {@link Tag}.
 */
package com.codename1.rad.models;


/**
 * 
 *  @author shannah
 */
public interface PropertySelectorProvider {

	public PropertySelector getSelector(Entity root);
}
