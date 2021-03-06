/*
 * Copyright (c) 2010, Christophe Souvignier. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.n0pe.asadmin.commands;

import org.n0pe.asadmin.AbstractAsAdminCmd;

public class DeleteJdbcConnectionPool
    extends AbstractAsAdminCmd
{

    public static final String JDBC = "delete-jdbc-connection-pool";
    private String poolName;

    private DeleteJdbcConnectionPool()
    {
    }

    public DeleteJdbcConnectionPool( String poolName )
    {
        this.poolName = poolName;
    }

    public boolean needCredentials()
    {
        return true;
    }

    public String getActionCommand()
    {
        if( poolName == null )
        {
            throw new IllegalStateException();
        }
        return JDBC;
    }

    public String[] getParameters()
    {
        return new String[]
            {
                poolName
            };
    }

}
