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

package com.fluidops.iwb.ajax;

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;

import com.fluidops.ajax.components.FImageButton;

/**
 * Input forms with fixed subject and variable predicate+object.
 * 
 * @author msc
 */
public abstract class FSubjectBasedInput extends FStatementInput
{

    // dynamic link to object, if initialized
    protected FImageButton objLink;
    
    /**
     * Constructor
     * 
     * @param id FComponent id
     * @param s subject init value (may be null)
     * @param p predicate init value (may be null)
     * @param o object init value (may be null)
     * @param deletable whether or not the input is deletable
     */
    protected FSubjectBasedInput(String id,Resource s,URI p,Value o,boolean deletable)
    {
        super(id,s,p,o,deletable);
        subjectEditable=false;
    }
    
    /**
     * Constructor
     * 
     * @param id FComponent id
     * @param stmt stmt used for initialization (may be 
     *          null or contain null components)
     * @param deletable whether or not the input is deletable
     */
    protected FSubjectBasedInput(String id,Statement stmt,boolean deletable)
    {
        super(id,stmt,deletable);
        subjectEditable=false;
    }
    

    @Override
    final protected Resource getCurrentSubject()
    {
        if (deleted())
            return null;

        return getInitSubject();
    }
    
    @Override
    public void initializeView() 
    {
        super.initializeView();
    }
}
