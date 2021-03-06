/**
 * This class is generated by jOOQ
 */
package com.ethercis.jooq.pg.tables.records;


import com.ethercis.jooq.pg.tables.PartyIdentified;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PartyIdentifiedRecord extends UpdatableRecordImpl<PartyIdentifiedRecord> implements Record6<UUID, String, String, String, String, String> {

	private static final long serialVersionUID = -240026647;

	/**
	 * Setter for <code>ehr.party_identified.id</code>.
	 */
	public void setId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ehr.party_identified.id</code>.
	 */
	public UUID getId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>ehr.party_identified.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ehr.party_identified.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>ehr.party_identified.party_ref_value</code>.
	 */
	public void setPartyRefValue(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ehr.party_identified.party_ref_value</code>.
	 */
	public String getPartyRefValue() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>ehr.party_identified.party_ref_scheme</code>.
	 */
	public void setPartyRefScheme(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ehr.party_identified.party_ref_scheme</code>.
	 */
	public String getPartyRefScheme() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>ehr.party_identified.party_ref_namespace</code>.
	 */
	public void setPartyRefNamespace(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ehr.party_identified.party_ref_namespace</code>.
	 */
	public String getPartyRefNamespace() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>ehr.party_identified.party_ref_type</code>.
	 */
	public void setPartyRefType(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>ehr.party_identified.party_ref_type</code>.
	 */
	public String getPartyRefType() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<UUID> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<UUID, String, String, String, String, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<UUID, String, String, String, String, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return PartyIdentified.PARTY_IDENTIFIED.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return PartyIdentified.PARTY_IDENTIFIED.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return PartyIdentified.PARTY_IDENTIFIED.PARTY_REF_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return PartyIdentified.PARTY_IDENTIFIED.PARTY_REF_SCHEME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return PartyIdentified.PARTY_IDENTIFIED.PARTY_REF_NAMESPACE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return PartyIdentified.PARTY_IDENTIFIED.PARTY_REF_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getPartyRefValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getPartyRefScheme();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getPartyRefNamespace();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getPartyRefType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PartyIdentifiedRecord value1(UUID value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PartyIdentifiedRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PartyIdentifiedRecord value3(String value) {
		setPartyRefValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PartyIdentifiedRecord value4(String value) {
		setPartyRefScheme(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PartyIdentifiedRecord value5(String value) {
		setPartyRefNamespace(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PartyIdentifiedRecord value6(String value) {
		setPartyRefType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PartyIdentifiedRecord values(UUID value1, String value2, String value3, String value4, String value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PartyIdentifiedRecord
	 */
	public PartyIdentifiedRecord() {
		super(PartyIdentified.PARTY_IDENTIFIED);
	}

	/**
	 * Create a detached, initialised PartyIdentifiedRecord
	 */
	public PartyIdentifiedRecord(UUID id, String name, String partyRefValue, String partyRefScheme, String partyRefNamespace, String partyRefType) {
		super(PartyIdentified.PARTY_IDENTIFIED);

		setValue(0, id);
		setValue(1, name);
		setValue(2, partyRefValue);
		setValue(3, partyRefScheme);
		setValue(4, partyRefNamespace);
		setValue(5, partyRefType);
	}
}
