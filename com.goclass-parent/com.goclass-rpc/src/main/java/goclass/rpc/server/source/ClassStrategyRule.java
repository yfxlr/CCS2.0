/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package goclass.rpc.server.source;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-11-07")
public class ClassStrategyRule implements org.apache.thrift.TBase<ClassStrategyRule, ClassStrategyRule._Fields>, java.io.Serializable, Cloneable, Comparable<ClassStrategyRule> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClassStrategyRule");

  private static final org.apache.thrift.protocol.TField SUBJECT_TEACHER_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("subjectTeacherNumber", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField SECTION_STUDENT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("sectionStudentNumber", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField MAX_AND_MIN_CLASS_STUDENT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("maxAndMinClassStudentNumber", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField RUNING_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("runing_time", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClassStrategyRuleStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClassStrategyRuleTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Short,java.lang.Integer> subjectTeacherNumber; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Short,java.lang.Integer> sectionStudentNumber; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> maxAndMinClassStudentNumber; // required
  public int runing_time; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUBJECT_TEACHER_NUMBER((short)2, "subjectTeacherNumber"),
    SECTION_STUDENT_NUMBER((short)3, "sectionStudentNumber"),
    MAX_AND_MIN_CLASS_STUDENT_NUMBER((short)4, "maxAndMinClassStudentNumber"),
    RUNING_TIME((short)5, "runing_time");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 2: // SUBJECT_TEACHER_NUMBER
          return SUBJECT_TEACHER_NUMBER;
        case 3: // SECTION_STUDENT_NUMBER
          return SECTION_STUDENT_NUMBER;
        case 4: // MAX_AND_MIN_CLASS_STUDENT_NUMBER
          return MAX_AND_MIN_CLASS_STUDENT_NUMBER;
        case 5: // RUNING_TIME
          return RUNING_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RUNING_TIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUBJECT_TEACHER_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("subjectTeacherNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.SECTION_STUDENT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("sectionStudentNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.MAX_AND_MIN_CLASS_STUDENT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("maxAndMinClassStudentNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.RUNING_TIME, new org.apache.thrift.meta_data.FieldMetaData("runing_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClassStrategyRule.class, metaDataMap);
  }

  public ClassStrategyRule() {
    this.runing_time = 50;

  }

  public ClassStrategyRule(
    java.util.Map<java.lang.Short,java.lang.Integer> subjectTeacherNumber,
    java.util.Map<java.lang.Short,java.lang.Integer> sectionStudentNumber,
    java.util.List<java.lang.Integer> maxAndMinClassStudentNumber,
    int runing_time)
  {
    this();
    this.subjectTeacherNumber = subjectTeacherNumber;
    this.sectionStudentNumber = sectionStudentNumber;
    this.maxAndMinClassStudentNumber = maxAndMinClassStudentNumber;
    this.runing_time = runing_time;
    setRuning_timeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClassStrategyRule(ClassStrategyRule other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSubjectTeacherNumber()) {
      java.util.Map<java.lang.Short,java.lang.Integer> __this__subjectTeacherNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(other.subjectTeacherNumber);
      this.subjectTeacherNumber = __this__subjectTeacherNumber;
    }
    if (other.isSetSectionStudentNumber()) {
      java.util.Map<java.lang.Short,java.lang.Integer> __this__sectionStudentNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(other.sectionStudentNumber);
      this.sectionStudentNumber = __this__sectionStudentNumber;
    }
    if (other.isSetMaxAndMinClassStudentNumber()) {
      java.util.List<java.lang.Integer> __this__maxAndMinClassStudentNumber = new java.util.ArrayList<java.lang.Integer>(other.maxAndMinClassStudentNumber);
      this.maxAndMinClassStudentNumber = __this__maxAndMinClassStudentNumber;
    }
    this.runing_time = other.runing_time;
  }

  public ClassStrategyRule deepCopy() {
    return new ClassStrategyRule(this);
  }

  @Override
  public void clear() {
    this.subjectTeacherNumber = null;
    this.sectionStudentNumber = null;
    this.maxAndMinClassStudentNumber = null;
    this.runing_time = 50;

  }

  public int getSubjectTeacherNumberSize() {
    return (this.subjectTeacherNumber == null) ? 0 : this.subjectTeacherNumber.size();
  }

  public void putToSubjectTeacherNumber(short key, int val) {
    if (this.subjectTeacherNumber == null) {
      this.subjectTeacherNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>();
    }
    this.subjectTeacherNumber.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Short,java.lang.Integer> getSubjectTeacherNumber() {
    return this.subjectTeacherNumber;
  }

  public ClassStrategyRule setSubjectTeacherNumber(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Short,java.lang.Integer> subjectTeacherNumber) {
    this.subjectTeacherNumber = subjectTeacherNumber;
    return this;
  }

  public void unsetSubjectTeacherNumber() {
    this.subjectTeacherNumber = null;
  }

  /** Returns true if field subjectTeacherNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetSubjectTeacherNumber() {
    return this.subjectTeacherNumber != null;
  }

  public void setSubjectTeacherNumberIsSet(boolean value) {
    if (!value) {
      this.subjectTeacherNumber = null;
    }
  }

  public int getSectionStudentNumberSize() {
    return (this.sectionStudentNumber == null) ? 0 : this.sectionStudentNumber.size();
  }

  public void putToSectionStudentNumber(short key, int val) {
    if (this.sectionStudentNumber == null) {
      this.sectionStudentNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>();
    }
    this.sectionStudentNumber.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Short,java.lang.Integer> getSectionStudentNumber() {
    return this.sectionStudentNumber;
  }

  public ClassStrategyRule setSectionStudentNumber(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Short,java.lang.Integer> sectionStudentNumber) {
    this.sectionStudentNumber = sectionStudentNumber;
    return this;
  }

  public void unsetSectionStudentNumber() {
    this.sectionStudentNumber = null;
  }

  /** Returns true if field sectionStudentNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetSectionStudentNumber() {
    return this.sectionStudentNumber != null;
  }

  public void setSectionStudentNumberIsSet(boolean value) {
    if (!value) {
      this.sectionStudentNumber = null;
    }
  }

  public int getMaxAndMinClassStudentNumberSize() {
    return (this.maxAndMinClassStudentNumber == null) ? 0 : this.maxAndMinClassStudentNumber.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getMaxAndMinClassStudentNumberIterator() {
    return (this.maxAndMinClassStudentNumber == null) ? null : this.maxAndMinClassStudentNumber.iterator();
  }

  public void addToMaxAndMinClassStudentNumber(int elem) {
    if (this.maxAndMinClassStudentNumber == null) {
      this.maxAndMinClassStudentNumber = new java.util.ArrayList<java.lang.Integer>();
    }
    this.maxAndMinClassStudentNumber.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getMaxAndMinClassStudentNumber() {
    return this.maxAndMinClassStudentNumber;
  }

  public ClassStrategyRule setMaxAndMinClassStudentNumber(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> maxAndMinClassStudentNumber) {
    this.maxAndMinClassStudentNumber = maxAndMinClassStudentNumber;
    return this;
  }

  public void unsetMaxAndMinClassStudentNumber() {
    this.maxAndMinClassStudentNumber = null;
  }

  /** Returns true if field maxAndMinClassStudentNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxAndMinClassStudentNumber() {
    return this.maxAndMinClassStudentNumber != null;
  }

  public void setMaxAndMinClassStudentNumberIsSet(boolean value) {
    if (!value) {
      this.maxAndMinClassStudentNumber = null;
    }
  }

  public int getRuning_time() {
    return this.runing_time;
  }

  public ClassStrategyRule setRuning_time(int runing_time) {
    this.runing_time = runing_time;
    setRuning_timeIsSet(true);
    return this;
  }

  public void unsetRuning_time() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RUNING_TIME_ISSET_ID);
  }

  /** Returns true if field runing_time is set (has been assigned a value) and false otherwise */
  public boolean isSetRuning_time() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RUNING_TIME_ISSET_ID);
  }

  public void setRuning_timeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RUNING_TIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SUBJECT_TEACHER_NUMBER:
      if (value == null) {
        unsetSubjectTeacherNumber();
      } else {
        setSubjectTeacherNumber((java.util.Map<java.lang.Short,java.lang.Integer>)value);
      }
      break;

    case SECTION_STUDENT_NUMBER:
      if (value == null) {
        unsetSectionStudentNumber();
      } else {
        setSectionStudentNumber((java.util.Map<java.lang.Short,java.lang.Integer>)value);
      }
      break;

    case MAX_AND_MIN_CLASS_STUDENT_NUMBER:
      if (value == null) {
        unsetMaxAndMinClassStudentNumber();
      } else {
        setMaxAndMinClassStudentNumber((java.util.List<java.lang.Integer>)value);
      }
      break;

    case RUNING_TIME:
      if (value == null) {
        unsetRuning_time();
      } else {
        setRuning_time((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SUBJECT_TEACHER_NUMBER:
      return getSubjectTeacherNumber();

    case SECTION_STUDENT_NUMBER:
      return getSectionStudentNumber();

    case MAX_AND_MIN_CLASS_STUDENT_NUMBER:
      return getMaxAndMinClassStudentNumber();

    case RUNING_TIME:
      return getRuning_time();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SUBJECT_TEACHER_NUMBER:
      return isSetSubjectTeacherNumber();
    case SECTION_STUDENT_NUMBER:
      return isSetSectionStudentNumber();
    case MAX_AND_MIN_CLASS_STUDENT_NUMBER:
      return isSetMaxAndMinClassStudentNumber();
    case RUNING_TIME:
      return isSetRuning_time();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ClassStrategyRule)
      return this.equals((ClassStrategyRule)that);
    return false;
  }

  public boolean equals(ClassStrategyRule that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_subjectTeacherNumber = true && this.isSetSubjectTeacherNumber();
    boolean that_present_subjectTeacherNumber = true && that.isSetSubjectTeacherNumber();
    if (this_present_subjectTeacherNumber || that_present_subjectTeacherNumber) {
      if (!(this_present_subjectTeacherNumber && that_present_subjectTeacherNumber))
        return false;
      if (!this.subjectTeacherNumber.equals(that.subjectTeacherNumber))
        return false;
    }

    boolean this_present_sectionStudentNumber = true && this.isSetSectionStudentNumber();
    boolean that_present_sectionStudentNumber = true && that.isSetSectionStudentNumber();
    if (this_present_sectionStudentNumber || that_present_sectionStudentNumber) {
      if (!(this_present_sectionStudentNumber && that_present_sectionStudentNumber))
        return false;
      if (!this.sectionStudentNumber.equals(that.sectionStudentNumber))
        return false;
    }

    boolean this_present_maxAndMinClassStudentNumber = true && this.isSetMaxAndMinClassStudentNumber();
    boolean that_present_maxAndMinClassStudentNumber = true && that.isSetMaxAndMinClassStudentNumber();
    if (this_present_maxAndMinClassStudentNumber || that_present_maxAndMinClassStudentNumber) {
      if (!(this_present_maxAndMinClassStudentNumber && that_present_maxAndMinClassStudentNumber))
        return false;
      if (!this.maxAndMinClassStudentNumber.equals(that.maxAndMinClassStudentNumber))
        return false;
    }

    boolean this_present_runing_time = true;
    boolean that_present_runing_time = true;
    if (this_present_runing_time || that_present_runing_time) {
      if (!(this_present_runing_time && that_present_runing_time))
        return false;
      if (this.runing_time != that.runing_time)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSubjectTeacherNumber()) ? 131071 : 524287);
    if (isSetSubjectTeacherNumber())
      hashCode = hashCode * 8191 + subjectTeacherNumber.hashCode();

    hashCode = hashCode * 8191 + ((isSetSectionStudentNumber()) ? 131071 : 524287);
    if (isSetSectionStudentNumber())
      hashCode = hashCode * 8191 + sectionStudentNumber.hashCode();

    hashCode = hashCode * 8191 + ((isSetMaxAndMinClassStudentNumber()) ? 131071 : 524287);
    if (isSetMaxAndMinClassStudentNumber())
      hashCode = hashCode * 8191 + maxAndMinClassStudentNumber.hashCode();

    hashCode = hashCode * 8191 + runing_time;

    return hashCode;
  }

  @Override
  public int compareTo(ClassStrategyRule other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSubjectTeacherNumber()).compareTo(other.isSetSubjectTeacherNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubjectTeacherNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subjectTeacherNumber, other.subjectTeacherNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSectionStudentNumber()).compareTo(other.isSetSectionStudentNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSectionStudentNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sectionStudentNumber, other.sectionStudentNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMaxAndMinClassStudentNumber()).compareTo(other.isSetMaxAndMinClassStudentNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxAndMinClassStudentNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxAndMinClassStudentNumber, other.maxAndMinClassStudentNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRuning_time()).compareTo(other.isSetRuning_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRuning_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runing_time, other.runing_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassStrategyRule(");
    boolean first = true;

    sb.append("subjectTeacherNumber:");
    if (this.subjectTeacherNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.subjectTeacherNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sectionStudentNumber:");
    if (this.sectionStudentNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.sectionStudentNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxAndMinClassStudentNumber:");
    if (this.maxAndMinClassStudentNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.maxAndMinClassStudentNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("runing_time:");
    sb.append(this.runing_time);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ClassStrategyRuleStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClassStrategyRuleStandardScheme getScheme() {
      return new ClassStrategyRuleStandardScheme();
    }
  }

  private static class ClassStrategyRuleStandardScheme extends org.apache.thrift.scheme.StandardScheme<ClassStrategyRule> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClassStrategyRule struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // SUBJECT_TEACHER_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map604 = iprot.readMapBegin();
                struct.subjectTeacherNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(2*_map604.size);
                short _key605;
                int _val606;
                for (int _i607 = 0; _i607 < _map604.size; ++_i607)
                {
                  _key605 = iprot.readI16();
                  _val606 = iprot.readI32();
                  struct.subjectTeacherNumber.put(_key605, _val606);
                }
                iprot.readMapEnd();
              }
              struct.setSubjectTeacherNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SECTION_STUDENT_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map608 = iprot.readMapBegin();
                struct.sectionStudentNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(2*_map608.size);
                short _key609;
                int _val610;
                for (int _i611 = 0; _i611 < _map608.size; ++_i611)
                {
                  _key609 = iprot.readI16();
                  _val610 = iprot.readI32();
                  struct.sectionStudentNumber.put(_key609, _val610);
                }
                iprot.readMapEnd();
              }
              struct.setSectionStudentNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAX_AND_MIN_CLASS_STUDENT_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list612 = iprot.readListBegin();
                struct.maxAndMinClassStudentNumber = new java.util.ArrayList<java.lang.Integer>(_list612.size);
                int _elem613;
                for (int _i614 = 0; _i614 < _list612.size; ++_i614)
                {
                  _elem613 = iprot.readI32();
                  struct.maxAndMinClassStudentNumber.add(_elem613);
                }
                iprot.readListEnd();
              }
              struct.setMaxAndMinClassStudentNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RUNING_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.runing_time = iprot.readI32();
              struct.setRuning_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClassStrategyRule struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.subjectTeacherNumber != null) {
        oprot.writeFieldBegin(SUBJECT_TEACHER_NUMBER_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.I32, struct.subjectTeacherNumber.size()));
          for (java.util.Map.Entry<java.lang.Short, java.lang.Integer> _iter615 : struct.subjectTeacherNumber.entrySet())
          {
            oprot.writeI16(_iter615.getKey());
            oprot.writeI32(_iter615.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.sectionStudentNumber != null) {
        oprot.writeFieldBegin(SECTION_STUDENT_NUMBER_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.I32, struct.sectionStudentNumber.size()));
          for (java.util.Map.Entry<java.lang.Short, java.lang.Integer> _iter616 : struct.sectionStudentNumber.entrySet())
          {
            oprot.writeI16(_iter616.getKey());
            oprot.writeI32(_iter616.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.maxAndMinClassStudentNumber != null) {
        oprot.writeFieldBegin(MAX_AND_MIN_CLASS_STUDENT_NUMBER_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.maxAndMinClassStudentNumber.size()));
          for (int _iter617 : struct.maxAndMinClassStudentNumber)
          {
            oprot.writeI32(_iter617);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RUNING_TIME_FIELD_DESC);
      oprot.writeI32(struct.runing_time);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClassStrategyRuleTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClassStrategyRuleTupleScheme getScheme() {
      return new ClassStrategyRuleTupleScheme();
    }
  }

  private static class ClassStrategyRuleTupleScheme extends org.apache.thrift.scheme.TupleScheme<ClassStrategyRule> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClassStrategyRule struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSubjectTeacherNumber()) {
        optionals.set(0);
      }
      if (struct.isSetSectionStudentNumber()) {
        optionals.set(1);
      }
      if (struct.isSetMaxAndMinClassStudentNumber()) {
        optionals.set(2);
      }
      if (struct.isSetRuning_time()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSubjectTeacherNumber()) {
        {
          oprot.writeI32(struct.subjectTeacherNumber.size());
          for (java.util.Map.Entry<java.lang.Short, java.lang.Integer> _iter618 : struct.subjectTeacherNumber.entrySet())
          {
            oprot.writeI16(_iter618.getKey());
            oprot.writeI32(_iter618.getValue());
          }
        }
      }
      if (struct.isSetSectionStudentNumber()) {
        {
          oprot.writeI32(struct.sectionStudentNumber.size());
          for (java.util.Map.Entry<java.lang.Short, java.lang.Integer> _iter619 : struct.sectionStudentNumber.entrySet())
          {
            oprot.writeI16(_iter619.getKey());
            oprot.writeI32(_iter619.getValue());
          }
        }
      }
      if (struct.isSetMaxAndMinClassStudentNumber()) {
        {
          oprot.writeI32(struct.maxAndMinClassStudentNumber.size());
          for (int _iter620 : struct.maxAndMinClassStudentNumber)
          {
            oprot.writeI32(_iter620);
          }
        }
      }
      if (struct.isSetRuning_time()) {
        oprot.writeI32(struct.runing_time);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClassStrategyRule struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map621 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.subjectTeacherNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(2*_map621.size);
          short _key622;
          int _val623;
          for (int _i624 = 0; _i624 < _map621.size; ++_i624)
          {
            _key622 = iprot.readI16();
            _val623 = iprot.readI32();
            struct.subjectTeacherNumber.put(_key622, _val623);
          }
        }
        struct.setSubjectTeacherNumberIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map625 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.sectionStudentNumber = new java.util.HashMap<java.lang.Short,java.lang.Integer>(2*_map625.size);
          short _key626;
          int _val627;
          for (int _i628 = 0; _i628 < _map625.size; ++_i628)
          {
            _key626 = iprot.readI16();
            _val627 = iprot.readI32();
            struct.sectionStudentNumber.put(_key626, _val627);
          }
        }
        struct.setSectionStudentNumberIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list629 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.maxAndMinClassStudentNumber = new java.util.ArrayList<java.lang.Integer>(_list629.size);
          int _elem630;
          for (int _i631 = 0; _i631 < _list629.size; ++_i631)
          {
            _elem630 = iprot.readI32();
            struct.maxAndMinClassStudentNumber.add(_elem630);
          }
        }
        struct.setMaxAndMinClassStudentNumberIsSet(true);
      }
      if (incoming.get(3)) {
        struct.runing_time = iprot.readI32();
        struct.setRuning_timeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
