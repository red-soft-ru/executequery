/*
 * ResultSetMetaDataTableModel.java
 *
 * Copyright (C) 2002-2017 Takis Diakoumis
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.executequery.gui.resultset;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * The sql result set meta data table model.
 *
 * @author Takis Diakoumis
 */
public class ResultSetMetaDataTableModel extends AbstractTableModel {

    private List<String> columns;

    private List<List<String>> metaData;

    public int getColumnCount() {

        if (columns != null) {

            return columns.size();
        }

        return 0;
    }

    public int getRowCount() {

        if (metaData != null) {

            return metaData.size();
        }

        return 0;
    }

    public Object getValueAt(int row, int column) {

        return metaData.get(row).get(column);
    }

    public boolean isCellEditable(int row, int column) {

        return false;
    }

    public String getColumnName(int column) {

        return columns.get(column);
    }


    public Class<?> getColumnClass(int column) {

        return String.class;
    }

    public void reset() {

        if (columns != null) {

            columns.clear();
        }
        columns = null;

        if (metaData != null) {

            metaData.clear();
        }
        metaData = null;
    }

    public void setValues(List<String> columns, List<List<String>> metaData) {

        this.columns = columns;
        this.metaData = metaData;

        fireTableDataChanged();
    }

}









