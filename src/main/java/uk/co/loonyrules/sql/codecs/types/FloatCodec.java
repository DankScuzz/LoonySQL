package uk.co.loonyrules.sql.codecs.types;

import uk.co.loonyrules.sql.codecs.Codec;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Codec for Encoding/Decoding a Float
 */
public class FloatCodec extends Codec<Float>
{

    /**
     * Construct and register this FloatCodec
     */
    public FloatCodec()
    {
        super("float", float.class, Float.class);
    }

    /**
     * Decode the data given into a Float object
     * @param resultSet The ResultSet to get our data from
     * @param type The type of Field this is
     * @param fieldName The name of this Field (the Column name)
     * @return The Float decoded
     * @throws SQLException If a MySQL error is encountered
     */
    @Override
    public Float decode(ResultSet resultSet, Class<?> type, String fieldName) throws SQLException
    {
        return resultSet.getFloat(fieldName);
    }

    /**
     * Encode the Float into the PreparedStatement
     * @param statement The PreparedStatement to modify
     * @param index The index of this Column
     * @param data The data to input
     * @throws SQLException If a MySQL error is encountered
     */
    @Override
    public void encode(PreparedStatement statement, int index, Float data) throws SQLException
    {
        statement.setFloat(index, data);
    }

    @Override
    public String toString()
    {
        return "FloatCodec{}";
    }

}