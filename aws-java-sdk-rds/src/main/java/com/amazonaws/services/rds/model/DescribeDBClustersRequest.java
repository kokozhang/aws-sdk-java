/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user-supplied DB cluster identifier. If this parameter is specified, information from only the specific DB
     * cluster is returned. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * A filter that specifies one or more DB clusters to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The
     * results list will only include information about the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBClusters</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Optional Boolean parameter that specifies whether the output includes information about clusters shared from
     * other AWS accounts.
     * </p>
     */
    private Boolean includeShared;

    /**
     * <p>
     * The user-supplied DB cluster identifier. If this parameter is specified, information from only the specific DB
     * cluster is returned. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The user-supplied DB cluster identifier. If this parameter is specified, information from only the
     *        specific DB cluster is returned. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match an existing DBClusterIdentifier.
     *        </p>
     *        </li>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB cluster identifier. If this parameter is specified, information from only the specific DB
     * cluster is returned. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The user-supplied DB cluster identifier. If this parameter is specified, information from only the
     *         specific DB cluster is returned. This parameter isn't case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match an existing DBClusterIdentifier.
     *         </p>
     *         </li>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The user-supplied DB cluster identifier. If this parameter is specified, information from only the specific DB
     * cluster is returned. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing DBClusterIdentifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The user-supplied DB cluster identifier. If this parameter is specified, information from only the
     *        specific DB cluster is returned. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match an existing DBClusterIdentifier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClustersRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more DB clusters to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The
     * results list will only include information about the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A filter that specifies one or more DB clusters to describe.</p>
     *         <p>
     *         Supported filters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs).
     *         The results list will only include information about the DB clusters identified by these ARNs.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * A filter that specifies one or more DB clusters to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The
     * results list will only include information about the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more DB clusters to describe.</p>
     *        <p>
     *        Supported filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs).
     *        The results list will only include information about the DB clusters identified by these ARNs.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * A filter that specifies one or more DB clusters to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The
     * results list will only include information about the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A filter that specifies one or more DB clusters to describe.</p>
     *        <p>
     *        Supported filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs).
     *        The results list will only include information about the DB clusters identified by these ARNs.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClustersRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more DB clusters to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The
     * results list will only include information about the DB clusters identified by these ARNs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more DB clusters to describe.</p>
     *        <p>
     *        Supported filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db-cluster-id</code> - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs).
     *        The results list will only include information about the DB clusters identified by these ARNs.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClustersRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you
     *        can retrieve the remaining results. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you
     *         can retrieve the remaining results. </p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you
     *        can retrieve the remaining results. </p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClustersRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBClusters</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBClusters</code> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBClusters</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeDBClusters</code> request. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBClusters</code> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBClusters</code> request. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClustersRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Optional Boolean parameter that specifies whether the output includes information about clusters shared from
     * other AWS accounts.
     * </p>
     * 
     * @param includeShared
     *        Optional Boolean parameter that specifies whether the output includes information about clusters shared
     *        from other AWS accounts.
     */

    public void setIncludeShared(Boolean includeShared) {
        this.includeShared = includeShared;
    }

    /**
     * <p>
     * Optional Boolean parameter that specifies whether the output includes information about clusters shared from
     * other AWS accounts.
     * </p>
     * 
     * @return Optional Boolean parameter that specifies whether the output includes information about clusters shared
     *         from other AWS accounts.
     */

    public Boolean getIncludeShared() {
        return this.includeShared;
    }

    /**
     * <p>
     * Optional Boolean parameter that specifies whether the output includes information about clusters shared from
     * other AWS accounts.
     * </p>
     * 
     * @param includeShared
     *        Optional Boolean parameter that specifies whether the output includes information about clusters shared
     *        from other AWS accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClustersRequest withIncludeShared(Boolean includeShared) {
        setIncludeShared(includeShared);
        return this;
    }

    /**
     * <p>
     * Optional Boolean parameter that specifies whether the output includes information about clusters shared from
     * other AWS accounts.
     * </p>
     * 
     * @return Optional Boolean parameter that specifies whether the output includes information about clusters shared
     *         from other AWS accounts.
     */

    public Boolean isIncludeShared() {
        return this.includeShared;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getIncludeShared() != null)
            sb.append("IncludeShared: ").append(getIncludeShared());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClustersRequest == false)
            return false;
        DescribeDBClustersRequest other = (DescribeDBClustersRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getIncludeShared() == null ^ this.getIncludeShared() == null)
            return false;
        if (other.getIncludeShared() != null && other.getIncludeShared().equals(this.getIncludeShared()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getIncludeShared() == null) ? 0 : getIncludeShared().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBClustersRequest clone() {
        return (DescribeDBClustersRequest) super.clone();
    }

}
