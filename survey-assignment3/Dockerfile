# BASE IMAGE with an alias #
FROM node:latest as build
WORKDIR /app

# Install Angular CLI to run Build #
RUN npm install -g @angular/cli

COPY ./package.json .
RUN npm install
COPY . .
RUN ng build

# BASE IMAGE with an alias #
FROM nginx as runtime

# Copy contents from the other container with alias "build" #
# onto the specified path in the current container#
EXPOSE 4200
COPY --from=build /app/dist/survey-assignment3 /usr/share/nginx/html