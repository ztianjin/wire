// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/edge_cases.proto
package com.squareup.wire.protos.edgecases;

import com.squareup.wire.Message;

public final class NoFields extends Message {
  private static final long serialVersionUID = 0L;

  public NoFields() {
  }

  private NoFields(Builder builder) {
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof NoFields;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public static final class Builder extends Message.Builder<NoFields> {

    public Builder() {
    }

    public Builder(NoFields message) {
      super(message);
    }

    @Override
    public NoFields build() {
      return new NoFields(this);
    }
  }
}
