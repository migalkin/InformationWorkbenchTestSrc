/*
 * Copyright (C) 2008-2012, fluid Operations AG
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package com.fluidops.iwb.facets;

import java.util.List;

import com.fluidops.ajax.components.FContainer;

public interface FacetRenderer {
	
	/**
	 * Puts the facets in the container passed to this method
	 * 
	 * @param cont the resultcontainer in which the facets should be rendered
	 * @param facets list of Facets to be rendered
	 */
	public void renderFacets(FContainer cont, List<Facet> facets);

}
