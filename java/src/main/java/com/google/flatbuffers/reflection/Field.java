// automatically generated by the FlatBuffers compiler, do not modify

package com.google.flatbuffers.reflection;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Field extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_25_2_10(); }
  public static Field getRootAsField(ByteBuffer _bb) { return getRootAsField(_bb, new Field()); }
  public static Field getRootAsField(ByteBuffer _bb, Field obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Field __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public com.google.flatbuffers.reflection.Type type() { return type(new com.google.flatbuffers.reflection.Type()); }
  public com.google.flatbuffers.reflection.Type type(com.google.flatbuffers.reflection.Type obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public int id() { int o = __offset(8); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public int offset() { int o = __offset(10); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public long defaultInteger() { int o = __offset(12); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public double defaultReal() { int o = __offset(14); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public boolean deprecated() { int o = __offset(16); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean required() { int o = __offset(18); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean key() { int o = __offset(20); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public com.google.flatbuffers.reflection.KeyValue attributes(int j) { return attributes(new com.google.flatbuffers.reflection.KeyValue(), j); }
  public com.google.flatbuffers.reflection.KeyValue attributes(com.google.flatbuffers.reflection.KeyValue obj, int j) { int o = __offset(22); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int attributesLength() { int o = __offset(22); return o != 0 ? __vector_len(o) : 0; }
  public com.google.flatbuffers.reflection.KeyValue attributesByKey(String key) { int o = __offset(22); return o != 0 ? com.google.flatbuffers.reflection.KeyValue.__lookup_by_key(null, __vector(o), key, bb) : null; }
  public com.google.flatbuffers.reflection.KeyValue attributesByKey(com.google.flatbuffers.reflection.KeyValue obj, String key) { int o = __offset(22); return o != 0 ? com.google.flatbuffers.reflection.KeyValue.__lookup_by_key(obj, __vector(o), key, bb) : null; }
  public com.google.flatbuffers.reflection.KeyValue.Vector attributesVector() { return attributesVector(new com.google.flatbuffers.reflection.KeyValue.Vector()); }
  public com.google.flatbuffers.reflection.KeyValue.Vector attributesVector(com.google.flatbuffers.reflection.KeyValue.Vector obj) { int o = __offset(22); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String documentation(int j) { int o = __offset(24); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int documentationLength() { int o = __offset(24); return o != 0 ? __vector_len(o) : 0; }
  public StringVector documentationVector() { return documentationVector(new StringVector()); }
  public StringVector documentationVector(StringVector obj) { int o = __offset(24); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public boolean optional() { int o = __offset(26); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  /**
   * Number of padding octets to always add after this field. Structs only.
   */
  public int padding() { int o = __offset(28); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  /**
   * If the field uses 64-bit offsets.
   */
  public boolean offset64() { int o = __offset(30); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createField(FlatBufferBuilder builder,
      int nameOffset,
      int typeOffset,
      int id,
      int offset,
      long defaultInteger,
      double defaultReal,
      boolean deprecated,
      boolean required,
      boolean key,
      int attributesOffset,
      int documentationOffset,
      boolean optional,
      int padding,
      boolean offset64) {
    builder.startTable(14);
    Field.addDefaultReal(builder, defaultReal);
    Field.addDefaultInteger(builder, defaultInteger);
    Field.addDocumentation(builder, documentationOffset);
    Field.addAttributes(builder, attributesOffset);
    Field.addType(builder, typeOffset);
    Field.addName(builder, nameOffset);
    Field.addPadding(builder, padding);
    Field.addOffset(builder, offset);
    Field.addId(builder, id);
    Field.addOffset64(builder, offset64);
    Field.addOptional(builder, optional);
    Field.addKey(builder, key);
    Field.addRequired(builder, required);
    Field.addDeprecated(builder, deprecated);
    return Field.endField(builder);
  }

  public static void startField(FlatBufferBuilder builder) { builder.startTable(14); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(nameOffset); builder.slot(0); }
  public static void addType(FlatBufferBuilder builder, int typeOffset) { builder.addOffset(1, typeOffset, 0); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addShort(2, (short) id, (short) 0); }
  public static void addOffset(FlatBufferBuilder builder, int offset) { builder.addShort(3, (short) offset, (short) 0); }
  public static void addDefaultInteger(FlatBufferBuilder builder, long defaultInteger) { builder.addLong(4, defaultInteger, 0L); }
  public static void addDefaultReal(FlatBufferBuilder builder, double defaultReal) { builder.addDouble(5, defaultReal, 0.0); }
  public static void addDeprecated(FlatBufferBuilder builder, boolean deprecated) { builder.addBoolean(6, deprecated, false); }
  public static void addRequired(FlatBufferBuilder builder, boolean required) { builder.addBoolean(7, required, false); }
  public static void addKey(FlatBufferBuilder builder, boolean key) { builder.addBoolean(8, key, false); }
  public static void addAttributes(FlatBufferBuilder builder, int attributesOffset) { builder.addOffset(9, attributesOffset, 0); }
  public static int createAttributesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startAttributesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addDocumentation(FlatBufferBuilder builder, int documentationOffset) { builder.addOffset(10, documentationOffset, 0); }
  public static int createDocumentationVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startDocumentationVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addOptional(FlatBufferBuilder builder, boolean optional) { builder.addBoolean(11, optional, false); }
  public static void addPadding(FlatBufferBuilder builder, int padding) { builder.addShort(12, (short) padding, (short) 0); }
  public static void addOffset64(FlatBufferBuilder builder, boolean offset64) { builder.addBoolean(13, offset64, false); }
  public static int endField(FlatBufferBuilder builder) {
    int o = builder.endTable();
    builder.required(o, 4);  // name
    builder.required(o, 6);  // type
    return o;
  }

  @Override
  protected int keysCompare(Integer o1, Integer o2, ByteBuffer _bb) { return compareStrings(__offset(4, o1, _bb), __offset(4, o2, _bb), _bb); }

  public static Field __lookup_by_key(Field obj, int vectorLocation, String key, ByteBuffer bb) {
    byte[] byteKey = key.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    int span = bb.getInt(vectorLocation - 4);
    int start = 0;
    while (span != 0) {
      int middle = span / 2;
      int tableOffset = __indirect(vectorLocation + 4 * (start + middle), bb);
      int comp = compareStrings(__offset(4, bb.capacity() - tableOffset, bb), byteKey, bb);
      if (comp > 0) {
        span = middle;
      } else if (comp < 0) {
        middle++;
        start += middle;
        span -= middle;
      } else {
        return (obj == null ? new Field() : obj).__assign(tableOffset, bb);
      }
    }
    return null;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Field get(int j) { return get(new Field(), j); }
    public Field get(Field obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
    public Field getByKey(String key) {  return __lookup_by_key(null, __vector(), key, bb); }
    public Field getByKey(Field obj, String key) {  return __lookup_by_key(obj, __vector(), key, bb); }
  }
}

