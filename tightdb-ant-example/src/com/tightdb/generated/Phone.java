/* This file was automatically generated by TightDB. */

package com.tightdb.generated;


import com.tightdb.*;
import com.tightdb.lib.*;

/**
 * This class represents a TightDB cursor and was automatically generated.
 */
public class Phone extends AbstractCursor<Phone> {

    public final StringCursorColumn<Phone, PhoneView, PhoneQuery> type;
    public final StringCursorColumn<Phone, PhoneView, PhoneQuery> number;

	public Phone(IRowsetBase rowset, long position) {
		super(PhoneTable.TYPES, rowset, position);

        type = new StringCursorColumn<Phone, PhoneView, PhoneQuery>(PhoneTable.TYPES, this, 0, "type");
        number = new StringCursorColumn<Phone, PhoneView, PhoneQuery>(PhoneTable.TYPES, this, 1, "number");
	}

	public java.lang.String getType() {
		return this.type.get();
	}

	public void setType(java.lang.String type) {
		this.type.set(type);
	}

	public java.lang.String getNumber() {
		return this.number.get();
	}

	public void setNumber(java.lang.String number) {
		this.number.set(number);
	}

	@Override
	public AbstractColumn<?, ?, ?, ?>[] columns() {
		return getColumnsArray(type, number);
	}

}