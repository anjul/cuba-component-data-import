package de.diedavids.cuba.dataimport.web.importlog

import com.haulmont.cuba.gui.WindowParam
import com.haulmont.cuba.gui.components.AbstractLookup
import com.haulmont.cuba.gui.components.GroupTable
import de.diedavids.cuba.dataimport.entity.ImportLog

import javax.inject.Inject

class ImportLogBrowse extends AbstractLookup {


    @Inject
    private GroupTable<ImportLog> importLogsTable

    @WindowParam(name = 'selectLogItem')
    private ImportLog selectLogItem

    @Override
    void ready() {
        super.ready()

        if (selectLogItem != null) {
            importLogsTable.sortBy(importLogsTable.datasource.metaClass.getPropertyPath('started'), false)
            importLogsTable.expandPath(selectLogItem)
            importLogsTable.setSelected(selectLogItem)
        }
    }


}