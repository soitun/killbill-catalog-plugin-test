/*
 * Copyright 2022-2022 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.plugin.catalog.test.models.plugin.boilerplate;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.joda.time.DateTime;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.catalog.api.Plan;
import org.killbill.billing.catalog.api.PriceList;
import org.killbill.billing.catalog.api.Product;
import org.killbill.billing.catalog.api.Unit;
import org.killbill.billing.catalog.api.rules.PlanRules;
import org.killbill.billing.catalog.plugin.api.StandalonePluginCatalog;

@JsonDeserialize( builder = StandalonePluginCatalogImp.Builder.class )
public class StandalonePluginCatalogImp implements StandalonePluginCatalog, Serializable {

    private static final long serialVersionUID = 0xC83F8C3B8F5C235AL;

    protected Iterable<PriceList> childrenPriceList;
    protected Iterable<Currency> currencies;
    protected PriceList defaultPriceList;
    protected DateTime effectiveDate;
    protected PlanRules planRules;
    protected Iterable<Plan> plans;
    protected Iterable<Product> products;
    protected Iterable<Unit> units;

    public StandalonePluginCatalogImp(final StandalonePluginCatalogImp that) {
        this.childrenPriceList = that.childrenPriceList;
        this.currencies = that.currencies;
        this.defaultPriceList = that.defaultPriceList;
        this.effectiveDate = that.effectiveDate;
        this.planRules = that.planRules;
        this.plans = that.plans;
        this.products = that.products;
        this.units = that.units;
    }
    protected StandalonePluginCatalogImp(final StandalonePluginCatalogImp.Builder<?> builder) {
        this.childrenPriceList = builder.childrenPriceList;
        this.currencies = builder.currencies;
        this.defaultPriceList = builder.defaultPriceList;
        this.effectiveDate = builder.effectiveDate;
        this.planRules = builder.planRules;
        this.plans = builder.plans;
        this.products = builder.products;
        this.units = builder.units;
    }
    protected StandalonePluginCatalogImp() { }
    @Override
    public Iterable<PriceList> getChildrenPriceList() {
        return this.childrenPriceList;
    }
    @Override
    public Iterable<Currency> getCurrencies() {
        return this.currencies;
    }
    @Override
    public PriceList getDefaultPriceList() {
        return this.defaultPriceList;
    }
    @Override
    public DateTime getEffectiveDate() {
        return this.effectiveDate;
    }
    @Override
    public PlanRules getPlanRules() {
        return this.planRules;
    }
    @Override
    public Iterable<Plan> getPlans() {
        return this.plans;
    }
    @Override
    public Iterable<Product> getProducts() {
        return this.products;
    }
    @Override
    public Iterable<Unit> getUnits() {
        return this.units;
    }
    @Override
    public boolean equals(final Object o) {
        if ( this == o ) {
            return true;
        }
        if ( ( o == null ) || ( this.getClass() != o.getClass() ) ) {
            return false;
        }
        final StandalonePluginCatalogImp that = (StandalonePluginCatalogImp) o;
        if( !Objects.equals(this.childrenPriceList, that.childrenPriceList) ) {
            return false;
        }
        if( !Objects.equals(this.currencies, that.currencies) ) {
            return false;
        }
        if( !Objects.equals(this.defaultPriceList, that.defaultPriceList) ) {
            return false;
        }
        if( ( this.effectiveDate != null ) ? ( 0 != this.effectiveDate.compareTo(that.effectiveDate) ) : ( that.effectiveDate != null ) ) {
            return false;
        }
        if( !Objects.equals(this.planRules, that.planRules) ) {
            return false;
        }
        if( !Objects.equals(this.plans, that.plans) ) {
            return false;
        }
        if( !Objects.equals(this.products, that.products) ) {
            return false;
        }
        if( !Objects.equals(this.units, that.units) ) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = ( 31 * result ) + Objects.hashCode(this.childrenPriceList);
        result = ( 31 * result ) + Objects.hashCode(this.currencies);
        result = ( 31 * result ) + Objects.hashCode(this.defaultPriceList);
        result = ( 31 * result ) + Objects.hashCode(this.effectiveDate);
        result = ( 31 * result ) + Objects.hashCode(this.planRules);
        result = ( 31 * result ) + Objects.hashCode(this.plans);
        result = ( 31 * result ) + Objects.hashCode(this.products);
        result = ( 31 * result ) + Objects.hashCode(this.units);
        return result;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
        sb.append("{");
        sb.append("childrenPriceList=").append(this.childrenPriceList);
        sb.append(", ");
        sb.append("currencies=").append(this.currencies);
        sb.append(", ");
        sb.append("defaultPriceList=").append(this.defaultPriceList);
        sb.append(", ");
        sb.append("effectiveDate=").append(this.effectiveDate);
        sb.append(", ");
        sb.append("planRules=").append(this.planRules);
        sb.append(", ");
        sb.append("plans=").append(this.plans);
        sb.append(", ");
        sb.append("products=").append(this.products);
        sb.append(", ");
        sb.append("units=").append(this.units);
        sb.append("}");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    public static class Builder<T extends StandalonePluginCatalogImp.Builder<T>> {

        protected Iterable<PriceList> childrenPriceList;
        protected Iterable<Currency> currencies;
        protected PriceList defaultPriceList;
        protected DateTime effectiveDate;
        protected PlanRules planRules;
        protected Iterable<Plan> plans;
        protected Iterable<Product> products;
        protected Iterable<Unit> units;

        public Builder() { }
        public Builder(final Builder that) {
            this.childrenPriceList = that.childrenPriceList;
            this.currencies = that.currencies;
            this.defaultPriceList = that.defaultPriceList;
            this.effectiveDate = that.effectiveDate;
            this.planRules = that.planRules;
            this.plans = that.plans;
            this.products = that.products;
            this.units = that.units;
        }
        public T withChildrenPriceList(final Iterable<PriceList> childrenPriceList) {
            this.childrenPriceList = childrenPriceList;
            return (T) this;
        }
        public T withCurrencies(final Iterable<Currency> currencies) {
            this.currencies = currencies;
            return (T) this;
        }
        public T withDefaultPriceList(final PriceList defaultPriceList) {
            this.defaultPriceList = defaultPriceList;
            return (T) this;
        }
        public T withEffectiveDate(final DateTime effectiveDate) {
            this.effectiveDate = effectiveDate;
            return (T) this;
        }
        public T withPlanRules(final PlanRules planRules) {
            this.planRules = planRules;
            return (T) this;
        }
        public T withPlans(final Iterable<Plan> plans) {
            this.plans = plans;
            return (T) this;
        }
        public T withProducts(final Iterable<Product> products) {
            this.products = products;
            return (T) this;
        }
        public T withUnits(final Iterable<Unit> units) {
            this.units = units;
            return (T) this;
        }
        public T source(final StandalonePluginCatalog that) {
            this.childrenPriceList = that.getChildrenPriceList();
            this.currencies = that.getCurrencies();
            this.defaultPriceList = that.getDefaultPriceList();
            this.effectiveDate = that.getEffectiveDate();
            this.planRules = that.getPlanRules();
            this.plans = that.getPlans();
            this.products = that.getProducts();
            this.units = that.getUnits();
            return (T) this;
        }
        protected Builder validate() {
          return this;
        }
        public StandalonePluginCatalogImp build() {
            return new StandalonePluginCatalogImp(this.validate());
        }
    }
}
