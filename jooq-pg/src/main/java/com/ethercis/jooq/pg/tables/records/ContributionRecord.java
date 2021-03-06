/**
 * This class is generated by jOOQ
 */
package com.ethercis.jooq.pg.tables.records;


import com.ethercis.jooq.pg.enums.ContributionChangeType;
import com.ethercis.jooq.pg.enums.ContributionDataType;
import com.ethercis.jooq.pg.enums.ContributionState;
import com.ethercis.jooq.pg.tables.Contribution;

import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Contribution table, compositions reference this table
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContributionRecord extends UpdatableRecordImpl<ContributionRecord> implements Record13<UUID, UUID, ContributionDataType, ContributionState, String, UUID, UUID, Timestamp, String, ContributionChangeType, String, Timestamp, Object> {

	private static final long serialVersionUID = 1080245225;

	/**
	 * Setter for <code>ehr.contribution.id</code>.
	 */
	public void setId(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ehr.contribution.id</code>.
	 */
	public UUID getId() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>ehr.contribution.ehr_id</code>.
	 */
	public void setEhrId(UUID value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ehr.contribution.ehr_id</code>.
	 */
	public UUID getEhrId() {
		return (UUID) getValue(1);
	}

	/**
	 * Setter for <code>ehr.contribution.contribution_type</code>.
	 */
	public void setContributionType(ContributionDataType value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ehr.contribution.contribution_type</code>.
	 */
	public ContributionDataType getContributionType() {
		return (ContributionDataType) getValue(2);
	}

	/**
	 * Setter for <code>ehr.contribution.state</code>.
	 */
	public void setState(ContributionState value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ehr.contribution.state</code>.
	 */
	public ContributionState getState() {
		return (ContributionState) getValue(3);
	}

	/**
	 * Setter for <code>ehr.contribution.signature</code>.
	 */
	public void setSignature(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ehr.contribution.signature</code>.
	 */
	public String getSignature() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>ehr.contribution.system_id</code>.
	 */
	public void setSystemId(UUID value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>ehr.contribution.system_id</code>.
	 */
	public UUID getSystemId() {
		return (UUID) getValue(5);
	}

	/**
	 * Setter for <code>ehr.contribution.committer</code>.
	 */
	public void setCommitter(UUID value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>ehr.contribution.committer</code>.
	 */
	public UUID getCommitter() {
		return (UUID) getValue(6);
	}

	/**
	 * Setter for <code>ehr.contribution.time_committed</code>.
	 */
	public void setTimeCommitted(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>ehr.contribution.time_committed</code>.
	 */
	public Timestamp getTimeCommitted() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>ehr.contribution.time_committed_tzid</code>.
	 */
	public void setTimeCommittedTzid(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>ehr.contribution.time_committed_tzid</code>.
	 */
	public String getTimeCommittedTzid() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>ehr.contribution.change_type</code>.
	 */
	public void setChangeType(ContributionChangeType value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>ehr.contribution.change_type</code>.
	 */
	public ContributionChangeType getChangeType() {
		return (ContributionChangeType) getValue(9);
	}

	/**
	 * Setter for <code>ehr.contribution.description</code>.
	 */
	public void setDescription(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>ehr.contribution.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>ehr.contribution.sys_transaction</code>.
	 */
	public void setSysTransaction(Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>ehr.contribution.sys_transaction</code>.
	 */
	public Timestamp getSysTransaction() {
		return (Timestamp) getValue(11);
	}

	/**
	 * Setter for <code>ehr.contribution.sys_period</code>.
	 */
	public void setSysPeriod(Object value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>ehr.contribution.sys_period</code>.
	 */
	public Object getSysPeriod() {
		return (Object) getValue(12);
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
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<UUID, UUID, ContributionDataType, ContributionState, String, UUID, UUID, Timestamp, String, ContributionChangeType, String, Timestamp, Object> fieldsRow() {
		return (Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<UUID, UUID, ContributionDataType, ContributionState, String, UUID, UUID, Timestamp, String, ContributionChangeType, String, Timestamp, Object> valuesRow() {
		return (Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return Contribution.CONTRIBUTION.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field2() {
		return Contribution.CONTRIBUTION.EHR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ContributionDataType> field3() {
		return Contribution.CONTRIBUTION.CONTRIBUTION_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ContributionState> field4() {
		return Contribution.CONTRIBUTION.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Contribution.CONTRIBUTION.SIGNATURE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field6() {
		return Contribution.CONTRIBUTION.SYSTEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field7() {
		return Contribution.CONTRIBUTION.COMMITTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return Contribution.CONTRIBUTION.TIME_COMMITTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Contribution.CONTRIBUTION.TIME_COMMITTED_TZID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ContributionChangeType> field10() {
		return Contribution.CONTRIBUTION.CHANGE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return Contribution.CONTRIBUTION.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field12() {
		return Contribution.CONTRIBUTION.SYS_TRANSACTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field13() {
		return Contribution.CONTRIBUTION.SYS_PERIOD;
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
	public UUID value2() {
		return getEhrId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionDataType value3() {
		return getContributionType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionState value4() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getSignature();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value6() {
		return getSystemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value7() {
		return getCommitter();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getTimeCommitted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getTimeCommittedTzid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionChangeType value10() {
		return getChangeType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value12() {
		return getSysTransaction();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value13() {
		return getSysPeriod();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value1(UUID value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value2(UUID value) {
		setEhrId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value3(ContributionDataType value) {
		setContributionType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value4(ContributionState value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value5(String value) {
		setSignature(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value6(UUID value) {
		setSystemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value7(UUID value) {
		setCommitter(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value8(Timestamp value) {
		setTimeCommitted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value9(String value) {
		setTimeCommittedTzid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value10(ContributionChangeType value) {
		setChangeType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value11(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value12(Timestamp value) {
		setSysTransaction(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord value13(Object value) {
		setSysPeriod(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContributionRecord values(UUID value1, UUID value2, ContributionDataType value3, ContributionState value4, String value5, UUID value6, UUID value7, Timestamp value8, String value9, ContributionChangeType value10, String value11, Timestamp value12, Object value13) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ContributionRecord
	 */
	public ContributionRecord() {
		super(Contribution.CONTRIBUTION);
	}

	/**
	 * Create a detached, initialised ContributionRecord
	 */
	public ContributionRecord(UUID id, UUID ehrId, ContributionDataType contributionType, ContributionState state, String signature, UUID systemId, UUID committer, Timestamp timeCommitted, String timeCommittedTzid, ContributionChangeType changeType, String description, Timestamp sysTransaction, Object sysPeriod) {
		super(Contribution.CONTRIBUTION);

		setValue(0, id);
		setValue(1, ehrId);
		setValue(2, contributionType);
		setValue(3, state);
		setValue(4, signature);
		setValue(5, systemId);
		setValue(6, committer);
		setValue(7, timeCommitted);
		setValue(8, timeCommittedTzid);
		setValue(9, changeType);
		setValue(10, description);
		setValue(11, sysTransaction);
		setValue(12, sysPeriod);
	}
}
